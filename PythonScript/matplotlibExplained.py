'''
program to understand add_subplot function
'''

import matplotlib.pyplot as plt
x = [1, 2, 3, 4, 5]
y = [1, 4, 9, 16, 25]
fig = plt.figure()
fig.add_subplot(111)
plt.scatter(x, y)
plt.show()

'''
These are subplot grid parameters encoded as a single integer. 
For example, "111" means "1x1 grid, first subplot" and "234" means "2x3 grid, 4th subplot".

Alternative form for add_subplot(111) is add_subplot(1, 1, 1).

'''
