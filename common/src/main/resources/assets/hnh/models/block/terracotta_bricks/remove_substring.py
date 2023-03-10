import os

substring = input("substring to remove: ")
for filename in os.listdir(os.getcwd()):
    os.rename(filename, filename.replace(substring, ''))
