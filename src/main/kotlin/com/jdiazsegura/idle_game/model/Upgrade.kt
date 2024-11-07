import jakarta.persistence.*

@Entity
data class Upgrade(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var name: String, // Ejemplo: "Gold Mine", "Energy Booster"
    var cost: Long,
    var effect: String, // Descripción del efecto
    var generationBoost: Double = 1.0, // Aumento en la tasa de generación

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user: User
)
