from firebase import firebase 

firebase = firebase.FirebaseApplication('https://iomfirebaseproject.firebaseio.com/')

result = firebase.get('CustomerDB',None)
