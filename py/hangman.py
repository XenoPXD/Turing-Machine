import sys, os, re
import random
import getpass
import unicodedata

hangman=[]
hangman.append("+--+\n|\n|\n|\\")
hangman.append("+--+\n|  o\n|\n|\\")
hangman.append("+--+\n|  o\n|  |\n|\\")
hangman.append("+--+\n|  o\n| /|\n|\\")
hangman.append("+--+\n|  o\n| /|\\\n|\\")
hangman.append("+--+\n|  o\n| /|\\\n|\\/")
hangman.append("+--+\n|  o\n| /|\\\n|\\/ \\")

def strip_accents(s):
    return ''.join(c for c in unicodedata.normalize('NFD', s)
                  if unicodedata.category(c) != 'Mn')

def getNbrErrors(word, chars):
    counter=0
    for cc in chars:
        trouve=True
        if cc != " ":
            trouve=False
            for cw in word:
                if strip_accents(cw.upper()) == cc.upper():
                    trouve=True
                    word = word.replace(cw, ' ')
            if trouve==False: 
                counter += 1
    return counter

def completeWord(word, chars):
    out=""
    for cw in word:
        if cw != " ":
            trouve=False
            for cc in chars:
                if cc != " ":
                    if strip_accents(cw.upper()) == cc.upper():
                        trouve=True
        else:
            trouve=True
            
        if trouve==False: 
            out = out + "_"
        else:
            out = out + cw
    return out; 


def clear():
    if sys.platform == "win32":
        os.system("cls")
    else:
        os.system("clear")

def randomWord():
    print("."),
    letterFirst = chr(random.randint(97, 122))
    letterSecond = chr(random.randint(97, 122))
    createWordsDict(letterFirst+letterSecond)
    out = choiceWordFile()
    if out != "":
        return out
    else:
        randomWord()
        
def createWordsDict(value):
    os.system("curl -s dict://dict.org/m:^^"+value+".*:fd-fra-eng:re > words.txt")
    
def choiceWordFile():
    oFile = open("words.txt","r") 
    aWords = []
    out = ""
    i = 0
    for line in oFile.readlines():
        result = re.search('"(.*)"', line)
        if (result != None):
            aWords.append(result.group(0).replace('"', ""))
            #print(result.group(0))
            i+=1
    if i>0:
        #print("i="+str(i))
        out = aWords[random.randint(0, i)]
    return out
    
    
    
# http://www.dict.org/bin/Dict
# http://www.dict.org/rfc2229.txt
# http://www.dict.org/links.html
# http://search.cpan.org/~neilb/Net-Dict-2.21/dict
# curl dict://dict.org/s:regexp::m[a-z]::d:
# curl dict://dict.org/m:[a]::regexp

word=""
reponse = input("Choix du mot automatique ? [O/N] ")
reponse = reponse.strip().lower()
if reponse.startswith('o'):
    print("Recherche d'un mot sur dict.org:"),
    word = randomWord()
    print()
elif reponse.startswith('n') or reponse == '':
    word = getpass.getpass('Entrez un mot à deviner : ')
else:
    print("Répondez par 'o' ou 'n'")
    sys.exit()

#word = getpass.getpass('Entrez un mot à deviner : ')
clear()
#print("word="+word)
gagne=False
completing=""
counter=0
chars = ""
print()
print(hangman[counter])
print()
completing = completeWord(word, chars)
print(completing)

while counter<6 or gagne==True:
    print()
    print("Lettres utilisées :")
    print(chars)
    print()
    char = input("Entrez une lettre : ")
    clear()
    chars = chars + " " + char
    counter=getNbrErrors(word, chars)
    print()
    sys.stdout.write(hangman[counter]+"\n")  
    print()
    completing = completeWord(word, chars)
    sys.stdout.write(completing+"\n")
    if completing.upper()==word.upper():
        print()
        print("Gagné !")
        print()
        gagne=True
        sys.exit()
print()
print("Perdu !")
print("Il falait trouver :")
print(word)
