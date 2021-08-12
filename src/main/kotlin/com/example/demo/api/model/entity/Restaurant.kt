package com.example.demo.api.model.entity

import com.example.demo.api.model.enumerable.RestaurantType
import com.example.demo.api.model.request.MenuRequest
import lombok.Getter
import lombok.Setter
import java.util.*
import javax.persistence.*

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
class Restaurant (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? =null,
    var name: String? = null,
)

@Entity
@DiscriminatorValue("양식")
class West(
    name: String,
    var munu: String,
    var price: Int
) : Restaurant(){
    @Enumerated(EnumType.STRING)
    var typename: RestaurantType = RestaurantType.양식

    companion object{
        fun of(menuRequest: MenuRequest):West{
            val west = West(menuRequest.name,menuRequest.menu,menuRequest.price)
            return west
        }
    }
}

@Entity
@DiscriminatorValue("한식")
class Kor(
    name: String,
    var munu: String,
    var price: Int
) : Restaurant(){
    @Enumerated(EnumType.STRING)
    var typename: RestaurantType = RestaurantType.한식

    companion object{
        fun of(menuRequest: MenuRequest):Kor{
            val kor = Kor(menuRequest.name,menuRequest.menu,menuRequest.price)
            return kor
        }
    }
}


@Entity
@DiscriminatorValue("중식")
class Cha(
    name: String,
    var munu: String,
    var price: Int
) : Restaurant(){
    @Enumerated(EnumType.STRING)
    var typename: RestaurantType = RestaurantType.중식

    companion object{
        fun of(menuRequest: MenuRequest):Cha{
            val cha = Cha(menuRequest.name,menuRequest.menu,menuRequest.price)
            return cha
        }
    }
}

@Entity
@DiscriminatorValue("일식")
class Jpn(
    name: String,
    var munu: String,
    var price: Int
) : Restaurant(){
    @Enumerated(EnumType.STRING)
    var typename: RestaurantType = RestaurantType.일식

    companion object{
        fun of(menuRequest: MenuRequest):Jpn{
            val jpn = Jpn(menuRequest.name,menuRequest.menu,menuRequest.price)
            return jpn
        }
    }
}

@Entity
@DiscriminatorValue("기타")
class Etc(
    name: String,
    var munu: String,
    var price: Int
) : Restaurant(){
    @Enumerated(EnumType.STRING)
    var typename: RestaurantType = RestaurantType.기타

    companion object{
        fun of(menuRequest: MenuRequest):Etc{
            val etc = Etc(menuRequest.name,menuRequest.menu,menuRequest.price)
            return etc
        }
    }
}
