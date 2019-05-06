# jenkins-demo1

## Etape 1 :
Lancer la commande : docker run -p 80:8080 -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts

Puis Se connecter 
----Jenkins : Construire un projet freestyle => créer a new item----
nom : Jenkins-demo1

Jenkins-demo1 > Configurer

### Source code Management
#### GIT
- mettre url : https://github.com/Zerby/docker-jenkins

#### Build
- Build periodically (H/5 * * * * toutes les 5 minutes)
Execute shell
npm install
Execute shell
npm test

Puis save the project

---- Ensuite installer le plugin NODEJS -----

## Plugin manager
NodeJS => install without restart

### Configure Tools

#### Add
NodeJS
Name : NodeJS9
Install automatically
Install for NodeJS 9.11.2

NodeJS
Name : NodeJS10
Install automatically
Install for NodeJS 10.15.3

Jenkins-demo1 > Configurer > Environnement de build

Ajouter le répertoire bin/ de Node/npm au PATH
Ajouter nodeJS9
SAVE

*Ensuite mettre à jour les environnements du Jenkins-demo1*


---- Ensuite installer le plugin JOBDSL et faire un nouvel item -----

## Plugin manager
nom du plugin : job dsl
Doc : https://plugins.jenkins.io/job-dsl
Doc complète :  https://jenkinsci.github.io/job-dsl-plugin/

### Jenkins : Construire un projet freestyle => créer a new item
nom : Job dsl demo1

## Paramètre :
### Source code Management
GIT
mettre url : https://github.com/Zerby/docker-jenkins

Ce github est un clone du votre du coup le test se base sur le fichier index.test.js

#### Build déclencheur
Ajouter période de test H/5 * * * *

#### Puis env :
- NodeJS10

#### Build :
- npm install
- npm test

#### Puis save the project
⇒ Lancer le build

Normalement notre job fonctionne et il a crée un job1.groovy qu'il faut build pour voir si le résultat est bon.

J'ai fait la 1ère étape qui est l'install et la 2ème qui est le test.

- Je n'ai pas compris comment faire une image de notre code et l'envoyer sur le docker hub.





