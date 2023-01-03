package com.splitscale.fordastore.core.container.create;

import java.io.IOException;

import com.splitscale.fordastore.core.container.ContainerRequest;
import com.splitscale.fordastore.core.repositories.ContainerRepository;

public class CreateContainerInteractor {
  private ContainerRepository repository;

  public CreateContainerInteractor(ContainerRepository repository) {
    this.repository = repository;
  }

  public void createContainer(ContainerRequest container) throws IOException {
    repository.add(container);
  }
}
