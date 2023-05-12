plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenCentral()

    // Local projects
    mavenLocal {
        content {
            includeGroup("cc.mewcraft")
            includeGroup("net.Indyuce") // remote is down
            includeGroup("net.leonardo_dgs")
            includeGroup("com.github.DieReicheErethons")
            includeGroup("me.xanium.gemseconomy")
        }
    }

    // Purpur MC
    maven("https://repo.purpurmc.org/snapshots") {
        content {
            includeGroup("org.purpurmc.purpur")
        }
    }

    // Paper MC
    maven("https://repo.papermc.io/repository/maven-public/") {
        content {
            includeGroup("io.papermc.paper")
            includeGroup("com.mojang")
            includeGroup("net.md-5")
        }
    }

    // Lucko my god
    maven("https://repo.lucko.me") {
        content {
            includeGroup("me.lucko")
        }
    }

    // ProtocolLib
    maven("https://repo.dmulloy2.net/repository/public/") {
        content {
            includeGroup("com.comphenix.protocol")
        }
    }

    // Phoenix616's stuff
    maven("https://repo.minebench.de/") {
        content {
            includeGroup("de.themoep.utils")
        }
    }

    // All projects hosted on jitpack
    maven("https://jitpack.io") {
        content {
            includeGroup("com.github.TownyAdvanced")
            includeGroup("com.github.MilkBowl")
            includeGroup("com.github.LoneDev6")
        }
    }

    // Towny
    maven("https://repo.glaremasters.me/repository/towny/") {
        content {
            includeGroup("com.palmergames.bukkit.towny")
        }
    }

    // MMO plugins
    maven("https://mvn.lumine.io/repository/maven-public/") {
        content {
            includeGroup("io.lumine")
        }
    }
    maven("https://nexus.phoenixdevt.fr/repository/maven-public/") {
        mavenContent {
            includeGroup("io.lumine")
        }
    }

    // WorldEdit & WorldGuard
    maven("https://maven.enginehub.org/repo/") {
        content {
            includeGroup("com.sk89q.worldguard")
            includeGroup("com.sk89q.worldguard.worldguard-libs")
            includeGroup("com.sk89q.worldedit")
            includeGroup("com.sk89q.worldedit.worldedit-libs")
        }
    }

    // NPCs
    maven("https://repo.citizensnpcs.co/#/") {
        content {
            includeGroup("net.citizensnpcs")
        }
    }

    // Placeholders
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/") {
        content {
            includeGroup("me.clip")
        }
    }

    // Bedrock bridge
    maven("https://repo.opencollab.dev/maven-snapshots/") {
        content {
            includeGroup("org.geysermc.floodgate")
        }
    }

    // EssentialsX
    maven("https://repo.essentialsx.net/releases/") {
        mavenContent {
            includeGroup("net.essentialsx")
        }
    }

    // AnvilGUI
    maven("https://repo.codemc.io/repository/maven-snapshots/") {
        content {
            includeGroup("net.wesjd")
        }
    }
}

dependencies {
    implementation("org.jetbrains:annotations:24.0.1")
}

java {
    withSourcesJar()
}