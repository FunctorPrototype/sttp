package com.softwaremill.sttp.file

import com.softwaremill.sttp.dom.experimental.{File => DomFile}

// wrap a DomFile
trait FileExtensions { self: File =>

  def toDomFile: DomFile = underlying.asInstanceOf[DomFile]
}

trait FileCompanionExtensions {

  def fromDomFile(file: DomFile): File = new File(file) {
    val name: String = file.name
    val size: Long = file.size.toLong
  }

}