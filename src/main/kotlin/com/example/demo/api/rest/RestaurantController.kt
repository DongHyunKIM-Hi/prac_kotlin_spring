package com.example.demo.api.rest

import com.example.demo.api.model.request.MenuRequest
import com.example.demo.api.model.response.ApiResponse
import com.example.demo.api.service.SaveMenuService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/restaurant/api/v1")
class RestaurantController(
    private val saveMenuService: SaveMenuService
) {
    @PostMapping("insert")
    fun saveMenu(
        @RequestBody menu : MenuRequest
    ) : ResponseEntity<ApiResponse<MenuRequest>>{
        saveMenuService.saveMenu(menu)
        return ResponseEntity.ok(ApiResponse.ok(menu))
    }
}