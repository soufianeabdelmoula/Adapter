# Adapter


Une entreprise souhaite pouvoir gérer un ensemble de documents pouvant être de nature différente (Texte,  HTML  ou  PDF).  Ces  classes  ne  possèdent  qu’une  seule  méthode  permettant  d’afficher  le document : il implémente alors une interface commune Document qui ne propose qu’une méthode afficheDocument(). Une classe composantPDF existe déjà, mais ne propose pas la méthode afficheDocument(), mais la méthode afficheNom() et afficheVersion(). Ces deux infos se trouvent maintenant dans la méthode afficheDocument(). 
# Question : Proposez une solution implémentation de ce problème.
