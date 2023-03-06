# ENGIMASSURANCE

# Description
Le projet ENIGMASSURANCE est un programme console écrit en Java permettant de créer des portefeuilles d'investissement contenant des actions et des obligations d'état. Le programme permet de créer de nouveaux produits, de les ajouter à des portefeuilles, de calculer la valeur totale d'un portefeuille et d'afficher la liste des produits dans un portefeuille.

# Fonctionnalités

* Création de nouveaux produits (actions et obligations d'état)
* Ajout de produits à des portefeuilles
* Calcul de la valeur totale d'un portefeuille
* Affichage de la liste des produits dans un portefeuille

# Choix techniques

Le projet a été développé en utilisant le langage de programmation Java et les principes de la programmation orientée objet pour organiser le code en classes et méthodes. Le stockage des produits dans les portefeuilles est géré avec une structure de données ArrayList pour gérer facilement les listes dynamiques et offrir de nombreuses méthodes utiles.

# Diagramme UML
Voici le diagramme UML de mon programme :
```
+--------------+       +-------------+      +----------------+
| Produit      |       | Portefeuille|      | ENIGMASSURANCE |
+--------------+       +-------------+      +----------------+
| String nom   |       | String nom  |      | void main()    |
| String type  |       | ArrayList  |      |                |
| double prix  |       | produits   |      |                |
+--------------+       +-------------+      +----------------+
| getNom()     |       | addProduit()|      |                |
| getType()    |       | getTotal() |      |                |
| getPrix()    |       | afficher() |      |                |
+--------------+       +-------------+      +----------------+
                      | calculTotal()|
                      +-------------+
```
                      
                      
# Points d'amélioration
Le projet est fonctionnel tel qu'il est actuellement, mais il pourrait être amélioré en ajoutant des fonctionnalités supplémentaires telles que la suppression de produits d'un portefeuille, la gestion de plusieurs portefeuilles, la sauvegarde des données dans une base de données, etc.

# Points de blocage
Le principal point de blocage que j'ai rencontré était la gestion des types de produits (actions et obligations). j'ai finalement décidé de stocker le type de produit sous forme de chaîne de caractères (par exemple "Tech company" pour une action de société technologique), ce qui permet une certaine flexibilité mais peut poser des problèmes si le type est mal orthographié ou mal saisi.

# Cycles de développement
Le code présenté pour la classe Produit est une classe abstraite qui contient les attributs et les méthodes nécessaires pour toutes les classes qui héritent de celle-ci. La classe Action hérite de la classe Produit et représente une action dans le portefeuille. Elle contient les attributs nombreActions et valeurAction, ainsi que la méthode getPrix() qui calcule le prix total de l'action. La classe Obligation hérite également de la classe Produit et représente une obligation d'État. Elle contient les attributs tauxInteret et montant, ainsi que la méthode getPrix() qui calcule le prix total de l'obligation.

# Conclusion
En conclusion, le projet ENIGMASSURANCE est un programme console fonctionnel qui peut être amélioré en ajoutant des fonctionnalités supplémentaires. Il utilise le langage de programmation Java et les principes de la programmation orientée objet pour organiser le code en classes et méthodes. Les classes Action et Obligation héritent de la classe Produit et représentent des actions et des obligations d'État respectivement. Le stockage des produits dans les portefeuilles est géré avec une structure de données ArrayList.
