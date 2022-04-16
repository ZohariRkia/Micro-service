# Micro-service avec Spring Boot:

Démarrage de l'application qui permet d'afficher les information sur les comptes :

![ex1](https://user-images.githubusercontent.com/102218192/163502944-299adfa2-83e5-4241-97d8-d043bc84b18b.PNG)

![exé2](https://user-images.githubusercontent.com/102218192/163503038-1e6e89c1-7454-43a6-998a-4bb1c536d87d.PNG)

on teste via un navigateur et on trouve la liste des comptes en format json:

![exé3](https://user-images.githubusercontent.com/102218192/163503113-83976a74-cd1a-4202-9b55-51fd7e42db30.PNG)

Consulter un suel compte via ID:

![image](https://user-images.githubusercontent.com/102218192/163503863-6f44392a-a9e3-4a33-b515-6d9bd12bf66a.png)

Dans cette partie on utilise l'outil Postman pour tester les requetes:

requete save: on ajoute deux compte:

![image](https://user-images.githubusercontent.com/102218192/163504411-a760dcb8-1dcd-46f0-93ae-32993fd6c4ce.png)

![localhost1](https://user-images.githubusercontent.com/102218192/163504483-b5877713-a84c-4b7e-8c66-e25af41d6c39.PNG)

requete update: on modifie le solde d'un compte par exemple:

![put](https://user-images.githubusercontent.com/102218192/163504626-baaf974f-11fe-49eb-ba02-c29810bd471b.PNG)

requete delete: on suprime un compte via le ID par exemple:

![delete1](https://user-images.githubusercontent.com/102218192/163504771-16e538ad-136c-4bd2-84d7-9b667b1b529c.PNG)

![delete2](https://user-images.githubusercontent.com/102218192/163504804-0c005909-8c43-4186-a768-3f5e63e35ad7.PNG)

documentation de micro-service:

![docs](https://user-images.githubusercontent.com/102218192/163651163-7f8c68a8-3f8d-4b7f-b7c4-68db0f247bbe.PNG)

On peut tester avec swagger:

![swaggar](https://user-images.githubusercontent.com/102218192/163651193-5ba885b0-0849-4a3d-9c93-c0de721707bd.PNG)

Si on met RestController en commentaire alors il sera comme suprimer:

![image](https://user-images.githubusercontent.com/102218192/163651525-45e8541f-b2a2-4515-8143-fd3e7c5c32d4.png)

Maintenant on utilise le module Spring data rest:

![apresSup1](https://user-images.githubusercontent.com/102218192/163651649-d19ed3a2-c81f-4bc9-a1a7-be365c7b7e64.PNG)
![apresSup2](https://user-images.githubusercontent.com/102218192/163651654-247712fd-ed54-407c-a4a3-d595f3115e0f.PNG)

via spring data rest on peut utiliser les projections:

![image](https://user-images.githubusercontent.com/102218192/163651933-77d38932-2e6f-4775-bd7f-a90bbffe6712.png)

on peut aussi consulter les comptes selon leur type:

![image](https://user-images.githubusercontent.com/102218192/163652351-7cb5266d-3daf-4fd8-81a6-95cc019c981e.png)

on effectue une opération metier de viremment:

![virement](https://user-images.githubusercontent.com/102218192/163652651-7a8995e8-2137-4409-b1ad-d09f3b3f5842.PNG)

on fait un virement de 8000 de compte C1 vers le compte C2:

![image](https://user-images.githubusercontent.com/102218192/163652751-8599a8b0-f4e0-4858-955c-8d507ea87052.png)

![vire3](https://user-images.githubusercontent.com/102218192/163652842-24f8cf6e-ccbb-436d-9d48-bbbe3ec3c91e.PNG)











