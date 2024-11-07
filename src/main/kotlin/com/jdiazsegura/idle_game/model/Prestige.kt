import jakarta.persistence.*

@Entity
data class Prestige(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    var user: User? = null,
    var multiplier: Double = 0.0,
    var resetPoints: Int = 0,
)