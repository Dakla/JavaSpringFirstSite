/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.repos;

import hello.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 *
 * @author Dakla
 */
public interface MessageRepo extends CrudRepository<Message, Long>{

    List<Message> findByTag(String tag);

}
