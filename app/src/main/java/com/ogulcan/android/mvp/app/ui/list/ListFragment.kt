package com.ogulcan.android.mvp.app.ui.list

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ogulcan.android.mvp.app.di.component.DaggerFragmentComponent
import com.ogulcan.android.mvp.app.di.module.FragmentModule
import com.ogulcan.android.mvp.app.models.DetailsViewModel
import com.ogulcan.android.mvp.app.models.Indicador
import com.ogulcan.android.mvp.app.models.dto.IndicadorDto
import com.ogulcan.android.mvp.app.util.SwipeToDelete
import kotlinx.android.synthetic.main.fragment_list.*
import javax.inject.Inject




/**
 * Created by ogulcan on 07/02/2018.
 */
class ListFragment: Fragment(), ListContract.View, ListAdapter.onItemClickListener {

    @Inject lateinit var presenter: ListContract.Presenter

    private lateinit var rootView: View

    private var indicadorList = ArrayList<IndicadorDto>()

    fun newInstance(): ListFragment {
        return ListFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependency()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater!!.inflate(com.ogulcan.android.mvp.app.R.layout.fragment_list, container, false)
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.attach(this)
        presenter.subscribe()
        initView()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.unsubscribe()
    }

    override fun showProgress(show: Boolean) {
        if (show) {
            progressBar.visibility = View.VISIBLE
        } else {
            progressBar.visibility = View.GONE
        }
    }

    override fun showErrorMessage(error: String) {
        Log.e("Error", error)
    }

    override fun loadDataSuccess(list: Indicador) {
        prepareListIndicador(list) 
        var adapter = ListAdapter(activity, indicadorList,list, this)
        recyclerView!!.setLayoutManager(LinearLayoutManager(activity))
        recyclerView!!.setAdapter(adapter)

        val swipeHandler = object : SwipeToDelete(activity) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val adapter = recyclerView.adapter as ListAdapter
                adapter.removeAt(viewHolder.adapterPosition)
            }
        }

        val itemTouchHelper = ItemTouchHelper(swipeHandler)
        itemTouchHelper.attachToRecyclerView(recyclerView)
    }

    override fun loadDataAllSuccess(model: DetailsViewModel) {
        print(model.toJson())
    }

    override fun itemRemoveClick(post: IndicadorDto) {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun itemDetail(postId: String,indicador: Indicador) {
        prepareListDetalle(indicador,postId)
        var adapter = ListAdapter(activity, indicadorList,indicador, this)
        recyclerView!!.setLayoutManager(LinearLayoutManager(activity))
        recyclerView!!.setAdapter(adapter)

        val swipeHandler = object : SwipeToDelete(activity) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val adapter = recyclerView.adapter as ListAdapter
                adapter.removeAt(viewHolder.adapterPosition)
            }
        }

        val itemTouchHelper = ItemTouchHelper(swipeHandler)
        itemTouchHelper.attachToRecyclerView(recyclerView)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun injectDependency() {
        val listComponent = DaggerFragmentComponent.builder()
                .fragmentModule(FragmentModule())
                .build()

        listComponent.inject(this)
    }

    private fun initView() {
        presenter.loadData()
    }

    companion object {
        val TAG: String = "ListFragment"
    }
     fun prepareListIndicador(listaIndicador : Indicador?){

        var indicador : IndicadorDto = IndicadorDto(listaIndicador!!.bitcoin.nombre,
                listaIndicador!!.bitcoin.valor.toString(),listaIndicador!!.bitcoin.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.dolar.nombre,listaIndicador.dolar.valor.toString(),
                listaIndicador.dolar.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.dolar_intercambio.nombre,
                listaIndicador.dolar_intercambio.valor.toString(),
                listaIndicador.dolar_intercambio.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.uf.nombre,listaIndicador.uf.valor.toString(),
                listaIndicador.uf.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.euro.nombre,listaIndicador.euro.valor.toString(),
                listaIndicador.euro.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.imacec.nombre,listaIndicador.imacec.valor.toString(),
                listaIndicador.imacec.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.ipc.nombre,listaIndicador.ipc.valor.toString(),
                listaIndicador.ipc.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.ivp.nombre,listaIndicador.ivp.valor.toString(),
                listaIndicador.ivp.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.libra_cobre.nombre,
                listaIndicador.libra_cobre.valor.toString(),listaIndicador.libra_cobre.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.tpm.nombre,listaIndicador.tpm.valor.toString(),
                listaIndicador.tpm.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.tasa_desempleo.nombre,
                listaIndicador.tasa_desempleo.valor.toString(),
                listaIndicador.tasa_desempleo.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.utm.nombre,listaIndicador.utm.valor.toString(),
                listaIndicador.utm.javaClass.simpleName)
        indicadorList.add(indicador)
    }
    fun prepareListDetalle(listaIndicador : Indicador?, postId: String){

        var indicador : IndicadorDto = IndicadorDto(listaIndicador!!.bitcoin.nombre,
                listaIndicador!!.bitcoin.valor.toString(),listaIndicador!!.bitcoin.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.dolar.nombre,listaIndicador.dolar.valor.toString(),
                listaIndicador.dolar.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.dolar_intercambio.nombre,
                listaIndicador.dolar_intercambio.valor.toString(),
                listaIndicador.dolar_intercambio.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.uf.nombre,listaIndicador.uf.valor.toString(),
                listaIndicador.uf.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.euro.nombre,listaIndicador.euro.valor.toString(),
                listaIndicador.euro.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.imacec.nombre,listaIndicador.imacec.valor.toString(),
                listaIndicador.imacec.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.ipc.nombre,listaIndicador.ipc.valor.toString(),
                listaIndicador.ipc.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.ivp.nombre,listaIndicador.ivp.valor.toString(),
                listaIndicador.ivp.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.libra_cobre.nombre,
                listaIndicador.libra_cobre.valor.toString(),listaIndicador.libra_cobre.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.tpm.nombre,listaIndicador.tpm.valor.toString(),
                listaIndicador.tpm.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.tasa_desempleo.nombre,
                listaIndicador.tasa_desempleo.valor.toString(),
                listaIndicador.tasa_desempleo.javaClass.simpleName)
        indicadorList.add(indicador)
        indicador= IndicadorDto(listaIndicador.utm.nombre,listaIndicador.utm.valor.toString(),
                listaIndicador.utm.javaClass.simpleName)
        indicadorList.add(indicador)
    }
}