package com.example.recicleviewinkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recicleviewinkotlin.databinding.ItemMenuBinding

class MenuAdapter(
    var arrayListMenu: ArrayList<ModelMenu>,
    private val onClick: (ModelMenu) -> Unit
) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(ItemMenuBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.onBind(arrayListMenu[position])

    }

    override fun getItemCount(): Int {
        return arrayListMenu.size
    }

    inner class MenuViewHolder(private var binding: ItemMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(menu: ModelMenu) {
            binding.tvTitle.text = menu.title
            binding.tvDesc.text = menu.desc
            binding.tvPrice.text = menu.price.toString()
            binding.profileImage.setImageResource(menu.img)

            itemView.setOnClickListener {
                onClick(menu)
            }
        }
    }

}
