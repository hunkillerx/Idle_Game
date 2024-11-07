import jakarta.persistence.*

@Entity
data class Resource(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var type: String, // Ejemplo: "gold", "energy"
    var amount: Long = 0,
    var generationRate: Double = 0.0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user: User
)
