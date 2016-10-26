# Sample input 
# 17.889999
# 18.129999
# 18.110001
# 17.98

# Output
# 0.24
# -0.019998
# -0.130001

array = []

with open("input.txt") as inputFile:
    for line in inputFile:
        array.append(float(line.rstrip()))

output = [y - x for x, y in zip(array, array[1:])]

outputFile = open("output.txt", "w")

for item in output:
    outputFile.write("%s\n" % item)
