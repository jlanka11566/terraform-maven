package com.deliveredtechnologies.terraform;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TerraformUtilsTest {

  @Test
  public void getDefaultTfModulesDirGetsTheDefaultTfModulesDirAsPath() {
    Path tfModulesPath = TerraformUtils.getDefaultTfModulesDir();
    Assert.assertEquals(Paths.get("src/main/.tfmodules"), tfModulesPath);
  }

  @Test
  public void getTerraformRootModuleDirReturnsTheDefaultDirWhenTheTfSourceDirIsNotFound() throws IOException {
    Path tfRootModulePath = TerraformUtils.getDefaultTerraformRootModuleDir();
    Assert.assertEquals(Paths.get("."), tfRootModulePath);
  }
}