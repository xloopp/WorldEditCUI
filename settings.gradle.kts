rootProject.name = "WorldEditCUI"

pluginManagement {
    repositories {
        // 确保以下仓库按顺序声明
        maven("https://maven.parchmentmc.org") // Parchment 主仓库
        maven("https://ldtteam.jfrog.io/artifactory/parchmentmc-public/") // Parchment 镜像
        maven("https://maven.minecraftforge.net") // Forge 工具
        maven("https://maven.fabricmc.net") // Fabric
        maven("https://maven.architectury.dev/") // Architectury
        gradlePluginPortal()
        
        // Stellardrift 仓库（如有需要）
        maven(url = "https://repo.stellardrift.ca/repository/stable/") {
            name = "stellardriftReleases"
            mavenContent { releasesOnly() }
        }
    }
}
sequenceOf(
    "fabric",
    "protocol-common",
    "protocol-fabric",
    "protocol-neoforge",
).forEach {
    include("worldeditcui-$it")
}
dependencyResolutionManagement {
    repositories {
        maven("https://maven.parchmentmc.org") // Parchment 主仓库
        maven("https://ldtteam.jfrog.io/artifactory/parchmentmc-public/") // Parchment 镜像
        maven("https://maven.minecraftforge.net") // Forge 工具
        maven("https://maven.fabricmc.net") // Fabric
        maven("https://maven.architectury.dev/") // Architectury
        gradlePluginPortal()
    }
}
