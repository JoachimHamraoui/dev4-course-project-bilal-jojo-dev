package ehb.multimedia.loans.repositories

import ehb.multimedia.loans.models.User
import org.springframework.data.jpa.repository.JpaRepository

import org.springframework.stereotype.Repository

@Repository

interface userRepository: JpaRepository<User, Long> {
}

