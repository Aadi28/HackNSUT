from firebase import firebase 

firebase = firebase.FirebaseApplication('https://iomfirebaseproject.firebaseio.com/')

result = firebase.get('OrganisationDB',None)

result1 = result

while result == result1:
	result1 = firebase.get('OrganisationDB',None)
	




C = {k:v for k,v in result1.items() if k not in result}

#print C 

C1 = str(C)

#a = 'curl -H ' "'Content-type:application/json'" ' --data ' "'{"'data'" ' : " +C1 + "}http://localhost:3001/mineBlock

print a
