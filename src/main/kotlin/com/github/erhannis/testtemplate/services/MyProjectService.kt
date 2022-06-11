package com.github.erhannis.testtemplate.services

import com.intellij.openapi.project.Project
import com.github.erhannis.testtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
