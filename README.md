# Application de gestion des porte feuilles et des transfers 

    

## PARTIE 1 : PRESENTATION DU SUJET DE PROJET
Le projet s'inscrit dans un contexte où la gestion des portefeuilles de devises représente un défi majeur face à l'essor des échanges internationaux. Afin de répondre à cette nécessité croissante, l'objectif central de notre projet est de concevoir et développer une application web innovante reposant sur une architecture de micro-services exploitant les technologies Spring Boot et Spring Cloud. Cette plateforme offrira une solution intégrée pour la gestion efficace des portefeuilles de devises et la réalisation sécurisée de transferts entre ces derniers. En abordant ces enjeux, nous envisageons non seulement de simplifier la gestion des fonds dans différentes devises, mais également de garantir des transferts fiables et sécurisés. L'application proposée présente également un potentiel d'expansion significatif grâce à son architecture de micro-services adaptable, ouvrant ainsi la voie à d'éventuelles fonctionnalités futures et intégrations avec d'autres systèmes financiers. Forts d'une analyse approfondie des besoins des utilisateurs finaux et des exigences fonctionnelles et non fonctionnelles, nous sommes confiants dans le fait que ce projet constituera une solution pertinente et innovante pour la gestion de portefeuilles de devises à l'échelle internationale.

## CONCEPTION DE PROJET

### Conception générale 
Cette section éclaire l'architecture globale du projet. Nous explorerons les grandes lignes et les interactions entre les composants clés qui forment le système dans son ensemble. À l'aide de diagrammes et de descriptions détaillées, nous décrirons la structure qui sous-tend le fonctionnement harmonieux de l'application.
 
Architecture de l’application 

L'architecture de l'application repose sur un modèle de micro-services, favorisant la modularité et la scalabilité. Deux micro-services fonctionnels sont mis en place : le service de gestion des portefeuilles ("Wallet") et le service de gestion des transferts entre ceux-ci. Chaque portefeuille est associé à un client, défini par un identifiant unique, un nom et une adresse e-mail. Chaque portefeuille possède également son propre identifiant, un solde, une date de création et une devise. Les transferts entre portefeuilles sont caractérisés par un identifiant, une date, un portefeuille source, un portefeuille de destination, un montant et un état (en attente, validé, rejeté). En parallèle, l'architecture intègre des composants cruciaux pour la gestion et le déploiement des micro-services. Le service Gateway agit comme une passerelle pour toutes les requêtes entrantes, facilitant la distribution du trafic vers les micro-services appropriés. Le service Discovery permet une gestion dynamique des instances de micro-services, favorisant une tolérance aux pannes efficace. Un service de configuration assure une gestion centralisée et sécurisée de la configuration des micro-services. Pour documenter de manière exhaustive et accessible les web services RESTful, la spécification OpenAPI (Swagger) est utilisée. Cette architecture soigneusement conçue fournit une base solide pour le développement d'une application robuste et évolutive, répondant ainsi aux besoins de gestion de portefeuilles de devises et de transferts sécurisés entre ceux-ci.
![arch](https://github.com/HOUD-FatimaEzzahra/Fatima-Ezzahra-HOUD-enset-adria-test/assets/85282175/9fbc526b-2b4f-4808-bca0-4a63118b1372)


## Interfaces utilisateurs 

Les interfaces utilisateur jouent un rôle central dans l'expérience globale de l'application. Dans cette section, nous explorerons en détail les différentes parties de l'interface, des écrans d'accueil aux flux de travail spécifiques. À l'aide de captures d'écran, de maquettes et d'explications détaillées, nous guiderons les utilisateurs à travers les fonctionnalités de l'application, en mettant l'accent sur la convivialité et la facilité d'utilisation.
![consul](https://github.com/HOUD-FatimaEzzahra/Fatima-Ezzahra-HOUD-enset-adria-test/assets/85282175/967a53e3-7e82-4527-aea2-57d8e78b15e8)



