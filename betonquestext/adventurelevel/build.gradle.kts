plugins {
    id("io.freefair.lombok")
}

dependencies {
    compileOnly(project(":betonquestext:common"))
    compileOnly(project(":adventurelevel:api"))
}