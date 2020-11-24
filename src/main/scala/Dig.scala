import java.util

import basemod.BaseMod
import basemod.interfaces.PostCreateStartingRelicsSubscriber
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer
import com.megacrit.cardcrawl.characters.AbstractPlayer
import com.megacrit.cardcrawl.unlock.UnlockTracker
import org.apache.logging.log4j.{LogManager, Logger}

@SpireInitializer
class Dig extends PostCreateStartingRelicsSubscriber {
  Dig.logger.info(
    "subscribing to PostCreateStartingRelics and postInitialize events"
  )
  BaseMod.subscribe(this)

  override def receivePostCreateStartingRelics(
      playerClass: AbstractPlayer.PlayerClass,
      relicsToAdd: util.ArrayList[String]
  ): Unit = {
    Dig.logger.info("Pre add", relicsToAdd)
    relicsToAdd.clear()
    relicsToAdd.add("Shovel")
    relicsToAdd.add("Blood Vial")
    Dig.logger.info("Post add", relicsToAdd)
    UnlockTracker.markRelicAsSeen("Shovel")
    UnlockTracker.markRelicAsSeen("Blood Vial")
  }
}

object Dig {
  final val logger: Logger = LogManager.getLogger(classOf[Dig].getName)
  final val MODNAME = "Dig"
  final val AUTHOR = "MaT1g3R"
  final val DESCRIPTION = "Replace starter relic with shovel"

  def initialize(): Unit = {
    val mod = new Dig()
  }
}
