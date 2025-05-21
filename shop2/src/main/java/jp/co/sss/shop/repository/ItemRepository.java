package jp.co.sss.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.shop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
