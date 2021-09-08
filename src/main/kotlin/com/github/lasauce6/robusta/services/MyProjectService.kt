package com.github.lasauce6.robusta.services

import com.intellij.openapi.project.Project
import com.github.lasauce6.robusta.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
