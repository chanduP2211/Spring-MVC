package com.stencil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stencil.entity.Section;

public interface SectionRepo extends JpaRepository<Section, String> {

}
