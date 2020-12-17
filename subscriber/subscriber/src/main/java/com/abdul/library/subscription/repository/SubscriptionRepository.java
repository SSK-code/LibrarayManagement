package com.abdul.library.subscription.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdul.library.subscription.entity.SubcriberBookIdPk;
import com.abdul.library.subscription.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, SubcriberBookIdPk> {

}
