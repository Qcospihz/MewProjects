plugins {
    id("cc.mewcraft.java-conventions")
    id("cc.mewcraft.deploy-conventions")
    id("cc.mewcraft.repository-conventions")
}

project.ext.set("name", "KeepInv")

group = "cc.mewcraft"
version = "1.0.0"
description = "Provides special handling of the keep-inventory feature"

dependencies {
    compileOnly(project(":mewcore"))
    compileOnly(libs.server.paper)

    // 3rd party plugins
    compileOnly(libs.helper) { isTransitive = false }
    compileOnly(libs.itemsadder)
}

tasks {
    project.ext.set("name", "AdventureLevel")

    processResources {
        filesMatching("**/paper-plugin.yml") {
            expand(
                mapOf(
                    "version" to "${project.version}",
                    "description" to project.description
                )
            )
        }
    }
}
