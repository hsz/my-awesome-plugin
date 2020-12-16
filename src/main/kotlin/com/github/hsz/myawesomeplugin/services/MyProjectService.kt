package com.github.hsz.myawesomeplugin.services

import com.intellij.openapi.project.Project
import com.github.hsz.myawesomeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
