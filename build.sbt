name := "dig"

version := "0.1"

scalaVersion := "2.13.4"

val SlayTheSpireVersion = "07-30-2020"
val ModTheSpireVersion = "3.18.0"
val BaseModVersion = "5.26.0"
val StSLibVersion = "1.21.2"
val SteamPath = "/home/umi/.local/share/Steam/steamapps"

libraryDependencies ++= Seq(
  "com.megacrit.cardcrawl" % "slaythespire" % SlayTheSpireVersion from s"file:///$SteamPath/common/SlayTheSpire/desktop-1.0.jar",
  "com.evacipated.cardcrawl" % "modthespire" % ModTheSpireVersion from s"file:///$SteamPath/workshop/content/646570/1605060445/ModTheSpire.jar",
  "basemod" % "basemod" % BaseModVersion from s"file:///$SteamPath/workshop/content/646570/1605833019/BaseMod.jar",
  "com.evacipated.cardcrawl.mod" % "StSLib" % StSLibVersion from s"file:///$SteamPath/workshop/content/646570/1609158507/StSLib.jar"
)
