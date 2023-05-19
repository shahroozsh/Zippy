package com.zippy.zippympv.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.zippy.zippympv.R
import com.zippy.zippympv.model.SliderTO
import com.zippy.zippympv.databinding.SliderViewpagerBinding
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class SliderAdapter : RecyclerView.Adapter<SliderAdapter.ViewHolder> {

    private var layoutInflater: LayoutInflater? = null;
    private var list: ArrayList<SliderTO>? = null;
//    lateinit var binding: AdapterAlbumBinding;
//     var iOnClickDialog: IOnClickDialog? = null;


    @Inject
    constructor(@ActivityContext context: Context) {
        layoutInflater = LayoutInflater.from(context);
        list = ArrayList<SliderTO>();
        list?.add(
            SliderTO(
                title = context.getString(R.string.slider1Title1),
                title2 = context.getString(R.string.slider1Title2),
                image = ContextCompat.getDrawable(context, R.drawable.slider1),
                text = context.getString(R.string.slider1)
            )
        )
        list?.add(
            SliderTO(
                title = context.getString(R.string.slider2Title1),
                title2 = context.getString(R.string.slider2Title2),
                image = ContextCompat.getDrawable(context, R.drawable.slider2),
                text = context.getString(R.string.slider2)
            )
        )
        list?.add(
            SliderTO(
                title = context.getString(R.string.slider3Title1),
                title2 = context.getString(R.string.slider3Title2),
                image =  ContextCompat.getDrawable(context, R.drawable.slider3),
                text =context.getString(R.string.slider3)
            )
        )


    }

//    fun updateAdapter(list:ArrayList<SliderTO>){
//        this.list = list;
//        notifyDataSetChanged()
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            SliderViewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        var view = layoutInflater?.inflate(R.layout.adapter_album, parent, false);
        return ViewHolder(binding);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

//        holder.itemView.setOnClickListener {
//            iOnClickDialog?.onClickDialog()
//        }

        holder.initView(list?.get(position))
//        Picasso.get().load(list?.get(position)?.image!!).into(binding.imgAlbum)

    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    class ViewHolder(private val binding: SliderViewpagerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun initView(photoDetailTO: SliderTO?) {


            binding.imgSlider.setImageDrawable(photoDetailTO?.image)
            binding.tTitle.text = photoDetailTO?.title
            binding.tSlider.text = photoDetailTO?.title2
            binding.tDescription.text = photoDetailTO?.text

        }


    }
}