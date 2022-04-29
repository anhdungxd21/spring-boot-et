package com.faceless.sbet.roomwebapp.data;

import com.faceless.sbet.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author dungla
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
