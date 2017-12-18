import sys, os
import getpass

hangman=[]
hangman.append("+--+\n|\n|\n|\\")
hangman.append("+--+\n|  o\n|\n|\\")
hangman.append("+--+\n|  o\n|  |\n|\\")
hangman.append("+--+\n|  o\n| /|\n|\\")
hangman.append("+--+\n|  o\n| /|\\\n|\\")
hangman.append("+--+\n|  o\n| /|\\\n|\\/")
hangman.append("+--+\n|  o\n| /|\\\n|\\/ \\")

def getNbrErrors(word, chars):
    counter=0
    for cc in chars:
        trouve=True
        if cc != " ":
            trouve=False
            for cw in word:
                if cw.upper() == cc.upper():
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
                    if cw.upper() == cc.upper():
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


word = getpass.getpass('Entrez un mot a devinez : ')
clear()
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
    print("Lettres deja utilisé :")
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
        print("Gagne !")
        print()
        gagne=True
        sys.exit()
print()
print("Perdu !")
print("Il falait trouver :")
print(word)
