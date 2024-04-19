module Cart where

{- 
Konstruktionsanleitungen: https://www.deinprogramm.de/

Datenanalyse:

Ein Einkaufskorb hat folgende Eigenschaften / besteht:
- Artikel -UND-
- Lieferaddresse (oder auch nicht / vielleicht)
^^^ zusammengesetzte Daten

Ein Artikel hat folgende Eigenschaften:
- Name -UND-
- Artikelart

Eine Artikelart ist eins der folgenden:
- Lifestyle -ODER-
- Möbel
^^^ Fallunterscheidung
-}

data ArticleName = MkArticleName String

data ArticleKind = Furniture | Lifestyle

data Article = MkArticle ArticleName ArticleKind

data ShippingAddress = HomeAddress | Packstation

data Cart = MkCart [Article] (Maybe ShippingAddress)

-- Maybe: in Java bekannt als Optional
