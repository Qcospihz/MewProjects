plugins {
    id("cc.mewcraft.repo-conventions")
    id("cc.mewcraft.java-conventions")
    id("cc.mewcraft.deploy-conventions")
    id("cc.mewcraft.paper-plugins")
}

project.ext.set("name", "MewFish")

group = "cc.mewcraft"
description = "Let's customize fishing!"
version = "1.15.3"

dependencies {
    // core libs
    compileOnly(project(":mewcore"))
    // libs embedded in core
    compileOnly(libs.configurate)
    compileOnly(libs.cronutils)
    compileOnly(libs.commons.io)

    // Server API
    compileOnly(libs.server.paper)

    // Plugin libs
    compileOnly(project(":mewnms:api"))
    compileOnly(libs.helper)
    compileOnly(libs.helper.redis)

    // 3rd party plugins
    compileOnly(libs.luckperms)
    compileOnly(libs.vault) { isTransitive = false }
    compileOnly(libs.towny)
    compileOnly(project(":economy:api"))

    // Test
    testImplementation(libs.junit)
    testImplementation(libs.helper)
    testImplementation(libs.server.paper)
}
