package com.example.demo.api.repository

import com.example.demo.api.model.entity.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RestaurantRepository : JpaRepository<Repository,Int>

@Repository
interface WestRepository : JpaRepository<West,Int>

@Repository
interface KorRepository : JpaRepository<Kor,Int>


@Repository
interface ChaRepository : JpaRepository<Cha,Int>


@Repository
interface JpnRepository : JpaRepository<Jpn,Int>


@Repository
interface EtcRepository : JpaRepository<Etc,Int>
