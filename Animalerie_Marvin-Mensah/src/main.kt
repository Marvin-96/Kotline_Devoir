fun main(){
    val animalerie = Animalerie()


    animalerie.ajouterAnimal(Chien())
    animalerie.ajouterAnimal(Chat())
    animalerie.ajouterAnimal(Oiseau())
    animalerie.ajouterAnimal(Vache())

    for (addNew in animalerie.list) {
        addNew.son()
        addNew.quiSuisJe()

    }
}