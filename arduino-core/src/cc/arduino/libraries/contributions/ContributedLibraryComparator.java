package cc.arduino.libraries.contributions;

import cc.arduino.packages.contributions.VersionComparator;

import java.util.Comparator;

public class ContributedLibraryComparator implements Comparator<ContributedLibrary> {

  @Override
  public int compare(ContributedLibrary lib1, ContributedLibrary lib2) {
    return VersionComparator.VERSION_COMPARATOR.compare(lib1.getVersion(), lib2.getVersion());
  }


}
