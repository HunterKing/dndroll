import random
DICE_TYPE = [4, 6, 8, 10, 12, 20];
dieChoice = 0;
rollCount = 0;      
while dieChoice >= 0 and dieChoice <= 5:
    print("Which die would you like to use?");
    print("1. d4\n2. d6\n3. d8\n4. d10\n5. d12\n6. d20\n7. Quit");
    dieChoice = int(input())-1;
    if dieChoice < 0 or dieChoice > 5:
        print("Value out of range, quitting.");
    else:
        rollCount = int(input("How many would you like to roll?\n"));
        if rollCount > 0:
            for i in range (0, rollCount):
                print("Roll %d: %d" % (i+1, random.randint(0, DICE_TYPE[dieChoice])));
            rollCount = 0;
            input("Press enter to continue.");
        else:
            print("You must roll at least one die.");
            