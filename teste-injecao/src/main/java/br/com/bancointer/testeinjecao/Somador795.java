package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador795")
public class Somador795 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
