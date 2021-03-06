package br.com.checktec.barbeariaLucas.Database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import br.com.checktec.barbeariaLucas.Models.Servico

@Dao
interface ServicoDAO {
    @Query("SELECT * FROM servico where id = :id")
    fun getById(id: Long) : Servico?
    @Query("SELECT * FROM servico")
    fun findAll(): List<Servico>
    @Insert
    fun insert(servico: Servico)
    @Delete
    fun delete(servico: Servico)
}