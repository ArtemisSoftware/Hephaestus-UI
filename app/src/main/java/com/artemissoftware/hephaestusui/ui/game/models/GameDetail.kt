package com.artemissoftware.hephaestusui.ui.game.models

data class GameDetail(
//    val id : Int,
//    val name: String,
//    val description: String,
//    val rating: Double,
//    val released: String,
    val backgroundImage: String,
//    val moviesCount: Int,
//    val parentPlatformsEntity: List<ParentPlatformsEntity>,
//    val platformsEntity: List<PlatformsEntity>,
//    val storesEntity: List<StoresEntity>,
//    val developersEntity: List<DevelopersEntity>,
//    val genresEntity: List<GenresEntity>,
//    val publishersEntity: List<PublishersEntity>
) {

    companion object{

        fun getMock() = GameDetail(
            backgroundImage = "https://rawg.io/assets/images/cover@2x.1e0ff948d9c0e7d05e0496c6ffe2e8a8.png"
        )

    }
}