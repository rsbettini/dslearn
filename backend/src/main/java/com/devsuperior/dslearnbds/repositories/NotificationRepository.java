package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entites.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
