import com.jdiazsegura.idle_game.repository.entity.UserEntity
import com.jdiazsegura.idle_game.service.model.ResponseModel
import jakarta.persistence.*
import java.util.*

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: UUID? = null,
    var name: String,
    var points: Int = 0,
    var level: Int = 1,
    var coins: Int = 0,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val resources: MutableList<Resource> = mutableListOf(),

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val upgrades: MutableList<Upgrade> = mutableListOf(),

    @OneToOne(mappedBy = "user", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val prestige: Prestige? = null
) {

    fun toResponseModel() = ResponseModel(
        id = id!!,
        name = name,
        points = points,
        level = level,
        coins = coins,
    )

    fun toEntity() = UserEntity(
        id = id.toString(),
        name = name,
        points = points,
        level = level,
        coins = coins
    )
}
