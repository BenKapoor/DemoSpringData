# DemoSpringData

Créer une base mysql à l'aide de wamp qui se nomera `demospringdatajpa`. Pour changer les informations de la db (url, username et password) aller dans le fichier `/src/main/resources/db.properties`

* demospringdatajpa = demo contenant le test du dao

* demospringdatajpav2 = demo contenant le test du service

Méthodologie :
1 Créer projet maven quickstart
2 ajouter dépendance spring framework et la dépendance de spring data
3 créer classes l’interface du dao (hérite de jpaRepository)
4 créer le fichier xml conteneur y ajouter les différents bean (ppc, datasource, entitymanagerFactory, transactionManager, spécifier le jpa:repository)
5 tester notre dao dans une classe test (tester create et findby)
6 coder le service (mettre en propriété du service l’interface SpringData, puis ajouter (getter, setter de l’interface + méthodes)
7 déclarer le service dans le conteneur (mettre en place l’autocablage/autowire du dao)
8  tester notre service dans une classe test (tester create et findby) :
    Chargement du conteneur
    récupération du bean service
    manipulation du bean service : lecture du bean d’un élève dont l’id = 1 


<b>Fonctionnalités présentes : </b>
- Creer un étudiant
- lister les étudiants par le nom


<b>Technologies : </b>
- Spring
- JPA
- JUnit 4
- Maven
