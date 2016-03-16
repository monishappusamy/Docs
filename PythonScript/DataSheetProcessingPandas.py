import pandas as pd

def readFile(filename):
    data = pd.read_csv(filename)
    return data
    
principalinvestigator = readFile('principalinvestigator1.csv')
principalinvestigator.columns=['EmpName','EmpID','InstID']

institutions = readFile('institutions.csv')
institutions.columns=['InstName','InstID']

researchtasknumber = readFile('researchtasknumber.csv')
researchtasknumber.columns = ['TaskID','EmpID']

nodes = readFile('node.csv')
nodes.columns = ['NodeID','NodeName']


InstNameandEmpName = principalinvestigator.merge(institutions, on='InstID', how='inner')[['InstName','EmpName']]
NodeIDInstName = InstNameandEmpName.merge(nodes, left_on='EmpName', right_on='NodeName', how='inner')[['NodeID','InstName']]
NodeIDNodeID = NodeIDInstName.merge(nodes, left_on='InstName', right_on='NodeName', how='inner')[['NodeID_x','NodeID_y']]

TaskIDandEmpName = principalinvestigator.merge(researchtasknumber, on='EmpID', how='inner')[['TaskID','EmpName']]
NodeIDTaskID = TaskIDandEmpName.merge(nodes, left_on='EmpName', right_on='NodeName', how='inner')[['NodeID','TaskID']]

nodes['NodeName'] = nodes['NodeName'].astype(str)
NodeIDTaskID['TaskID'] = NodeIDTaskID['TaskID'].astype(str)

NodeIDNodeID2 = NodeIDTaskID.merge(nodes, left_on='TaskID', right_on='NodeName', how='inner')[['NodeID_x','NodeID_y']]

frames = [NodeIDNodeID, NodeIDNodeID2]
result = pd.concat(frames)

result.to_csv('result.csv', sep=',')
