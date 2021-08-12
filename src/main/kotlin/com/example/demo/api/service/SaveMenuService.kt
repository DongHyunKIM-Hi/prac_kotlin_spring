package com.example.demo.api.service

import com.example.demo.api.model.request.MenuRequest

interface SaveMenuService {
    fun saveMenu(menuRequest: MenuRequest)
}