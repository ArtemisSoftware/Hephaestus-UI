package com.artemissoftware.hephaestusui.ui.game.models

data class GameDetail(
    val name: String,
    val description: String,
    val backgroundImage: String,
    val developer: String,
    val publisher: String
) {

    companion object{

        fun getMock() = GameDetail(
            name = "Artemis Hunt",
            description = "In Greek tradition, Artemis is the daughter of the sky god and king of gods Zeus and Leto, and the twin sister of Apollo. In most accounts, the twins are the products of an extramarital liaison. For this, Zeus' wife Hera forbade Leto from giving birth anywhere on land. Only the island of Delos gave refuge to Leto, allowing her to give birth to her children. Usually, Artemis is the twin to be born first, who then proceeds to assist Leto in the birth of the second child, Apollo. Like her brother, she was a kourotrophic (child-nurturing) deity, that is the patron and protector of young children, especially young girls, and women, and was believed to both bring disease upon women and children and relieve them of it. Artemis was worshipped as one of the primary goddesses of childbirth and midwifery along with Eileithyia and Hera. Much like Athena and Hestia, Artemis preferred to remain a maiden goddess and was sworn never to marry, and was thus one of the three Greek virgin goddesses, over whom the goddess of love and lust, Aphrodite, had no power whatsoever.\n" +
                    "\n" +
                    "In myth and literature, Artemis is presented as a hunting goddess of the woods, surrounded by her followers, who is not to be crossed. In the myth of Actaeon, when the young hunter sees her bathing naked, he is transformed into a deer by the angered goddess, and then devoured by his own hunting dogs who cannot tell their own master. In the story of Callisto, the girl is driven away from Artemis' company after breaking her vow of virginity, having laid with and been impregnated by Zeus. In certain versions, Artemis is the one to turn Callisto into a bear, or even kill her, for the insolence.\n" +
                    "\n" +
                    "In the Epic tradition, Artemis halted the winds blowing the Greek ships during the Trojan War, stranding the Greek fleet in Aulis, after King Agamemnon, the leader of the expedition, shot and killed her sacred deer. Artemis demanded the sacrifice of Iphigenia, Agamemnon's young daughter, as compensation for her slain deer. In most versions, when Iphigenia is led to the altar to be offered as sacrifice, Artemis pities her and takes her away, leaving another deer in her place.\n" +
                    "\n" +
                    "Artemis was one of the most widely venerated of the Ancient Greek deities, her worship spread throughout ancient Greece, with her multiple temples, altars, shrines, and local veneration found everywhere in the ancient world. Her great temple at Ephesus was one of the Seven Wonders of the Ancient World, before it was burnt to the ground. Artemis' symbols included a bow and arrow, a quiver, and hunting knives, and the deer and the cypress were sacred to her. Diana, her Roman equivalent, was especially worshipped on the Aventine Hill in Rome, near Lake Nemi in the Alban Hills, and in Campania.",
            backgroundImage = "https://rawg.io/assets/images/cover@2x.1e0ff948d9c0e7d05e0496c6ffe2e8a8.png",
            developer = "EvilGirls",
            publisher = "Bow and arrow"
        )

    }
}