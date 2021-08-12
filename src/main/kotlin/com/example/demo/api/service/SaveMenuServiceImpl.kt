package com.example.demo.api.service

import com.example.demo.api.model.entity.*
import com.example.demo.api.model.request.MenuRequest
import com.example.demo.api.repository.*
import org.springframework.stereotype.Service

@Service
class SaveMenuServiceImpl (
    private val restaurantRepository: RestaurantRepository,
    private val westRepository: WestRepository,
    private val korRepository: KorRepository,
    private val jpnRepository: JpnRepository,
    private val chaRepository: ChaRepository,
    private val etcRepository: EtcRepository
    ) : SaveMenuService{


    override fun saveMenu(menuRequest: MenuRequest) {
        when(menuRequest.category){
            "양식" -> westRepository.save(West.of(menuRequest))
            "한식" -> korRepository.save(Kor.of(menuRequest))
            "중식" -> chaRepository.save(Cha.of(menuRequest))
            "일식" -> jpnRepository.save(Jpn.of(menuRequest))
            "기타" -> etcRepository.save(Etc.of(menuRequest))
            else -> {println("몰라용")}
        }
    }
    }